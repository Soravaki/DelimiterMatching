import java.util.Stack;
public class PostfixExpression {
    Stack<String> s;
    String expression;
    String[] character;
    public PostfixExpression(String expression) {
        this.expression = expression;
        character = expression.split("");
    }

    public void checkValues(){
        s = new Stack<>();
        for (String value : character){
            if (DigitCheck(value)){
                s.push(value);
            }
            else{
                int num1 = Integer.parseInt(s.pop());
                int num2 = Integer.parseInt(s.pop());
                switch(value){
                    // Change to string when work
                    case "+"->{s.push(num1 + num2);}
                    case "-"->{s.push(num1 - num2);}
                }
            }
        }
    }

    public boolean DigitCheck(String character){
        //System.out.println("'"+ character+"' is a number");
        //System.out.println("'"+ character +"' is a letter");
        return Character.isDigit(character.charAt(0));
    }
}
