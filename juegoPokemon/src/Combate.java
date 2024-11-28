public class Combate {

    // Añada los atributos y el constructor *************
    Pokemon pokemonjugador;
    Pokemon pokemonRival;

    //***************************************************
    public Combate(Pokemon jugador, Pokemon rival) {
        pokemonjugador = jugador;
        pokemonRival = rival;
    }

    public Pokemon Ronda() {
        int poderJugador = pokemonjugador.calcularPoder(pokemonRival);
        int poderRival = pokemonRival.calcularPoder(pokemonjugador);

        if (poderJugador > poderRival) {
            pokemonRival.disminuirAguante();     // El rival pierde aguante
            pokemonjugador.subirNivel();         // Al subir de nivel deberia de regenerar el aguante
            System.out.println("Gana la ronda :" + pokemonjugador.getNombre());
            return pokemonjugador;               // El jugador gana
        } else if (poderRival > poderJugador) {
            pokemonjugador.disminuirAguante();  // El jugador pierde aguante
            System.out.println("Gana la ronda :" + pokemonRival.getNombre());
            return pokemonRival;                 // El rival gana
        } else {
            return null;                         // En caso de empate, no hay ganador
        }
    }

    public Pokemon Ganador() {
        if (pokemonjugador.getAguante() <= 0 && pokemonRival.getAguante() <= 0) {
            return null;                                // Si ambos poseen el aguante en 0, seria un empate
        } else if (pokemonjugador.getAguante() <= 0) {
            return pokemonRival;                        // El rival gana
        } else if (pokemonRival.getAguante() <= 0) {
            return pokemonjugador;                      // El jugador gana
        }

        return null;
    }


}
/* Anotaciones */
//12+2*2(nivel)   15-2*2(nivel)
//Si ganaa es del mismo nivel , si pierde es del nivel oponente
//gana , sube 1 nivel y regenera aguante = nivel
