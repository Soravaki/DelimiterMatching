import java.util.Stack;
public class DelimiterMatching {
    Stack<String> s;
    String expression;
    String[] character;
    public DelimiterMatching(String expression) {
        this.expression = expression;
        character = expression.split("");
        checkDelimiter();
    }

    public boolean checkDelimiter(){
        s = new Stack<>();
        for (String value : character) {
            if (value.equals("(") || value.equals("[")) {
                s.push(value);
            }
            if (value.equals(")") || value.equals("]")) {
                if (s.isEmpty()){
                    System.out.println("Missing left delimiter error for " + expression);
                    return false;
                }
                String popped = s.pop();
                if ( (popped.equals("(") && value.equals("]"))) {
                    System.out.println("Matching Error for " + expression);
                    return false;
                }
                if ((popped.equals("[") && value.equals(")"))) {
                    System.out.println("Matching Error for " + expression);
                    return false;
                }
            }
        }
        if (s.size() != 0){
            System.out.println("Missing right delimiter error for " + expression);
            return false;
        }
        else{
            System.out.println("All delimiter match for " + expression + ".");
            return true;
        }
    }

    public void changeExpression(String expression){
        this.expression = expression;
        character = expression.split("");
        checkDelimiter();
    }
}
