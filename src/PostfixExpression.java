import java.util.Stack;
public class PostfixExpression {
    Stack<String> s;
    String expression;
    String[] character;
    public PostfixExpression(String expression) {
        this.expression = expression;
        character = expression.split(" ");
        checkValues();
        System.out.println(s.peek());
    }

    public void checkValues(){
        s = new Stack<>();
        for (String value : character){
            if (DigitCheck(value)){
                s.push(value);
                System.out.println(value);
            }
            else{
                double num1 = Double.parseDouble(s.pop());
                double num2 = Double.parseDouble(s.pop());
                switch(value){
                    case "+"-> s.push(Double.toString(num1 + num2));
                    case "-"-> s.push(Double.toString(num1 - num2));
                    case "*"-> s.push(Double.toString(num1 * num2));
                    case "/"-> s.push(Double.toString(num2 / num1));
                }
                System.out.println(num1+value+num2+"="+s.peek()  );
            }
        }
    }

    public boolean DigitCheck(String character){
        return Character.isDigit(character.charAt(0));
    }
}
