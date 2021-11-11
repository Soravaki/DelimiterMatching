public class Runner {
    public static void main(String[] args) {
        DelimiterMatching m = new DelimiterMatching("c[d]");
        m.changeExpression("(w*(x+y)/z-(p/(r-q)))");
        m.changeExpression("x(()");
        m.changeExpression("x)aaa");
    }
}
