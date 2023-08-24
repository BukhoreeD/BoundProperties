package footballscores;

import java.util.Scanner;

public class FootballMatch {
    public static void main(String[] args) {
        LiveScoreBean liveScoreBean = new LiveScoreBean();

        FootballFan fan1 = new FootballFan();
        FootballFan fan2 = new FootballFan();

        liveScoreBean.addPropertyChangeListener(fan1);
        liveScoreBean.addPropertyChangeListener(fan2);

        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Enter Score ");
            input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            liveScoreBean.setScoreLine(input);
        }

        scanner.close();
    }
}
