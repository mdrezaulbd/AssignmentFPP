package assignment5.problem3;

interface  Figure {

     void getFigure();

}

 class UpwardHat implements Figure {
    @Override
    public void getFigure() {


        System.out.print("/\\ ");
    }

}

 class DownwardHat implements Figure {

    @Override
    public void getFigure() {
        System.out.print("\\/ ");

    }
}


 class FaceMaker  implements Figure {
    @Override
    public void getFigure() {
        System.out.print(":) ");
    }
}

 class Vertical implements Figure {
    @Override
    public void getFigure() {
        System.out.print("|| ");
    }
}

class Main {
    public static void main(String[] args) {


        Figure[] figures = new Figure[5];
        figures[0] = new UpwardHat();
        figures[1] = new UpwardHat();
        figures[2] = new DownwardHat();
        figures[3] = new FaceMaker();
        figures[4] = new Vertical();


        for (Figure figure : figures) {
            figure.getFigure();
        }

        System.out.println();
        for (Figure figure : figures) {
            System.out.print(figure.getClass().getSimpleName() + " : ");
            figure.getFigure();
            System.out.println();
        }

    }
}