public class TriFunction {
    public static void main(String[] args) {
        TriFunctionInterface<Integer> exp = (x,y,k)->2 * x * y - k + 8;
        int res = exp.compute(10, 20,30);
        System.out.println(res);
    }
}
