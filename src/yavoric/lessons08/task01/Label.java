package yavoric.lessons08.task01;

public class Label extends Component {

    @Override
    public void draw() {
        {
            System.out.println("Компонент Label");
            System.out.println("_____________");
            System.out.println("|"+caption+"|");
            System.out.println("_____________");
        }

    }
}
