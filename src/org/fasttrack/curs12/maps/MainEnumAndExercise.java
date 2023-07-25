package org.fasttrack.curs12.maps;

public class MainEnumAndExercise {
    private PuncteCardinale myFavoritePunctCardinal;

    public MainEnumAndExercise(PuncteCardinale myFavoritePunctCardinal) {
        this.myFavoritePunctCardinal = myFavoritePunctCardinal;
    }

    public static void main(String[] args) {
        System.out.println(PuncteCardinale.EST);
        MainEnumAndExercise exercise = new MainEnumAndExercise(PuncteCardinale.VEST);
        System.out.println("Prescurtarea punctului meu cardinal favorit este " + exercise.myFavoritePunctCardinal.getPrescurtare());;
    }
}
