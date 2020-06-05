package application;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        //Criando uma stream de inteiro, convertendo meu List para uma stream
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));

        //Criando uma stream com o map() para aplicar uma função para cada
        //elemento da minha string
        Stream<Integer> st2 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st2.toArray()));

        //Criando uma stream do tipo String
        Stream<String> st3 = Stream.of("Maria", "Joao", "Lucas");
        System.out.println(Arrays.toString(st3.toArray()));

        Stream<Integer> st4 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));


    }
}
