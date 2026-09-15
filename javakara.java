import javakara.JavaKaraProgram;

public class PictureInversion extends JavaKaraProgram {

    public void myProgram() {
        while (!kara.treeFront()) {
            processOneRow();
            prepareNextRow();
        }
        processOneRow();
    }

    private void processOneRow() {
        while (!kara.treeFront()) {
            invertLeaf();
            kara.move();
        }
        invertLeaf();
    }

    private void invertLeaf() {
        if (kara.onLeaf()) {
            kara.removeLeaf();
        } else {
            kara.putLeaf();
        }
    }

    private void prepareNextRow() {
        if (kara.treeRight()) {
            kara.turnLeft();
            if (!kara.treeFront()) {
                kara.move();
                kara.turnLeft();
            }
        } else {
            kara.turnRight();
            if (!kara.treeFront()) {
                kara.move();
                kara.turnRight();
            }
        }
    }
}