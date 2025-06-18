class ComplexNum {

    private double real;
    private double imaginary;

    public ComplexNum(double real, double imagine) {
        this.real = real;
        this.imaginary = imagine;
    }

    public double getReal() {
        return real;
    }

    public double getImagine() {
        return imaginary;
    }


    public ComplexNum add(ComplexNum other) {
        double realSum = this.getReal() + other.getReal();
        double imagineSum = this.getImagine() + other.getImagine();
        return new ComplexNum(realSum, imagineSum);
    }

    public ComplexNum sub(ComplexNum other) {
        ComplexNum diff = this.add(new ComplexNum(-1 * other.getReal(), -1 * other.getImagine()));
        return diff;
    }

    public ComplexNum mult(ComplexNum other) {
        double realProduct = this.getReal() * other.getReal();
        double imaginedProduct = this.getReal() * other.getImagine() + this.getImagine() * other.getReal() + this.getImagine() * other.getImagine();
        return new ComplexNum(realProduct, imaginedProduct);
    }

    

}