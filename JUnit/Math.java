package JUnit;

public class Math {

    public int Add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int Subtract(int a, int b){
        int difference = a - b;
        return difference;
    }

    public int Multiply(int a, int b){
        int product = a * b;
        return product;
    }

    public int Divide(int a, int b) {
        int divide = a / b;
        return divide;
    }

    public void Student() throws Exception {
        if (10 > 9) {
            throw new Exception("My grade is F");
        } else {
            throw new Exception("My Grade Is Passed!");
        }
    }

    public void ModelBehav() {

    }

}