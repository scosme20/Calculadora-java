import java.util.Scanner;

class javaCalculator
{

    public static void main(String[] args)
    {
        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número");
        num1 = input.nextInt();

        System.out.println("Insira o segundo número");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("selecione a operação");
        operation = op.next();

        if (operation.equals("+"))
        {
            System.out.println("Sua resposta é " + (num1 + num2));
        }
        if (operation.equals("-"))
        {
            System.out.println("Sua resposta é " + (num1 - num2));
        }

        if (operation.equals("/"))
        {
            System.out.println("Sua resposta é " + (num1 / num2));
        }
        if (operation.equals("*"))
        {
            System.out.println("Sua resposta é " + (num1 * num2));
        }

    }
}