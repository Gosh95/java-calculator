package calculator.engine;


import calculator.io.Input;
import calculator.io.Output;

import java.util.Scanner;

public class Console implements Input, Output {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String input() {
        return scanner.nextLine();
    }

    @Override
    public String initMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append("1. 조회").append("\n");
        sb.append("2. 계산").append("\n");
        sb.append("3. 종료").append("\n");
        sb.append("선택 : ");

        System.out.print(sb);

        String input = input();

        System.out.println();

        return input;
    }

    @Override
    public void print(String str) {
        System.out.println(str);
    }

    @Override
    public void illegalExceptionMessage() {
        System.out.println("입력값을 다시 확인해주세요.");
    }

    @Override
    public void exceptionMessage() {
        System.out.println("알수없는 오류가 발생하였습니다.");
    }

    @Override
    public void divisionByZero() {
        System.out.println();
    }

    @Override
    public void exitMessage() {
        System.out.println("계산기를 종료합니다.");
    }
}
