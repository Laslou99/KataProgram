package Study_3;

public class Lessen_2_1_10 {
    public static class ComplexNumber {
        private final double re;
        private final double im;
        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof ComplexNumber)) {
                return false;
            }
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(that.re, re) == 0 &&
                    Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {
            int result = Double.hashCode(re);
            result = 31 * result + Double.hashCode(im);
            return result;
        }
    }
}
