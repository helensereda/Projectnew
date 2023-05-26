package Figures;
    public abstract class Figure {

        private String figureName;

        public Figure (String figureName){
            this.figureName = figureName;
        }

        public String getFigureName() {
            return figureName;
        }

        public abstract double getAria(); //  тип функций который обязан вернуть значение
    public abstract double getPerimeter();

}
