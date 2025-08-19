public class LinearRegression {
    private double[] weights;
    private double learningRate = 0.00000001;
    private int iterations = 10000;

    public LinearRegression(int featureCount) {
        weights = new double[featureCount + 1]; // +1 for bias
    }

    // Predict function
    public double predict(double[] features) {
        double result = weights[0]; // bias
        for (int i = 0; i < features.length; i++) {
            result += weights[i + 1] * features[i];
        }
        return result;
    }

    // Train using gradient descent
    public void train(double[][] X, double[] y) {
        int n = y.length;

        for (int iter = 0; iter < iterations; iter++) {
            double[] gradients = new double[weights.length];

            for (int i = 0; i < n; i++) {
                double prediction = predict(X[i]);
                double error = prediction - y[i];

                gradients[0] += error; // bias gradient
                for (int j = 0; j < X[i].length; j++) {
                    gradients[j + 1] += error * X[i][j];
                }
            }

            // Update weights
            for (int j = 0; j < weights.length; j++) {
                weights[j] -= (learningRate * gradients[j]) / n;
            }
        }
    }

}
