package com.company;
import java.util.regex.*;
import java.util.Scanner;
/*Task:
 *Пользователь вводит с клавиатуры строчку, являющуюся паролем.
 */
public class lab_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String pattern = "[A-Za-z0-9_]+";

        String capital_letters = "[A-Z]";

        String small_letters = "[a-z]";

        String digits = "[0-9]";

        System.out.print("Введите пароль: ");

        String password = in.nextLine();

        in.close();


        Pattern CL = Pattern.compile(capital_letters);

        Matcher mCL = CL.matcher(password);

        Pattern d = Pattern.compile(digits);

        Matcher md = d.matcher(password);

        Pattern sl = Pattern.compile(small_letters);

        Matcher mSL = sl.matcher(password);

        Pattern P = Pattern.compile(pattern);

        Matcher m = P.matcher(password);


        if (md.find() && mSL.find() && mCL.find())
            if (m.matches() && password.substring(m.start(), m.end()).equals(password))
                if (password.length() >= 8)
                    System.out.println("Пароль успешно составлен.");

                else {
                    System.out.println("Пароль должен состоять из 8 или более символов, попробуйте снова.");
                }
            else {
                System.out.println("Допустимыми символами для пароля являются цифры, английских буквы и знаки подчёркивания, попробуйте снова.");
            }
        else {
            System.out.println("Пароль должен содержать хотя бы одну заглавную букву, одну маленькую букву и одну цифру, попробуйте снова.");
        }

    }
}