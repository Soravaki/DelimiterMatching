public class Runner {
    public static void main(String[] args) {
        /*DelimiterMatching m = new DelimiterMatching("c[d]");
        m.changeExpression("(w*(x+y)/z-(p/(r-q)))");
        m.changeExpression("x(()");
        m.changeExpression("x)aaa");*/
        PostfixExpression a = new PostfixExpression("2 7 + 1 2 + +");
        PostfixExpression b = new PostfixExpression("1 2 3 4 + + +");
        PostfixExpression c = new PostfixExpression("9 3 * 8 / 4 +");
        PostfixExpression d = new PostfixExpression("3 3 + 7 * 9 2 / +");
        PostfixExpression e = new PostfixExpression("9 3 / 2 * 7 9 * + 4 -");
        PostfixExpression f = new PostfixExpression("5 5 + 2 * 4 / 9 +");
    }
}
