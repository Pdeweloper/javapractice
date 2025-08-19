import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String file = "C:/Users/User/Desktop/house price prediction(java)/data/dataset1.csv";
        ArrayList<double[]> featuresList = new ArrayList<>();
        ArrayList<Double> targetList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            double[] features = new double[4]; // Size, Bedrooms, Age, Location
            features[0] = Double.parseDouble(values[0]); // size
            features[1] = Double.parseDouble(values[1]); // bedrooms
            features[2] = Double.parseDouble(values[2]); // age
            features[3] = Double.parseDouble(values[4]); // location (encoded as number in CSV)

            double target = Double.parseDouble(values[3]); // price

            featuresList.add(features);
            targetList.add(target);
        }

        int dataSize = targetList.size();
        double[][] X = new double[dataSize][4];
        double[] y = new double[dataSize];

        for (int i = 0; i < dataSize; i++) {
            X[i] = featuresList.get(i);
            y[i] = targetList.get(i);
        }

        LinearRegression model = new LinearRegression(4); // 4 features
        model.train(X, y);


        // Get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter house size (in sq.ft): ");
        double size = sc.nextDouble();

        System.out.print("Enter number of bedrooms: ");
        double bedrooms = sc.nextDouble();

        System.out.print("Enter age of the house (in years): ");
        double age = sc.nextDouble();

        System.out.println("Choose location: 1 for Urban, 2 for Suburban, 3 for Rural");
        int locationChoice = sc.nextInt();
        double locationEncoded = switch (locationChoice) {
            case 1 -> 3.0;
            case 2 -> 2.0;
            case 3 -> 1.0;
            default -> 0.0;
        };

        double[] userFeatures = {size, bedrooms, age, locationEncoded};
        double predictedPrice = model.predict(userFeatures);

        System.out.println(String.format("Predicted house price: Rs.%.0f", predictedPrice));
    }
}
