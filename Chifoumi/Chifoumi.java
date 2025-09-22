public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
        if (chifoumiAction == ChifoumiAction.ROCK) {
            return ChifoumiAction.SCISSOR;
        } else if (chifoumiAction == ChifoumiAction.PAPER) {
            return ChifoumiAction.ROCK;
        } else {
            return ChifoumiAction.PAPER;
        }
    }
}