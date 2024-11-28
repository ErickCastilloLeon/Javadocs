public class Pokemon {

    /**
     * @param nombre Nombre del pokemon
     * @param tipo De si es tipo Agua, Fuego o Tierra
     * @param nivel Del pokemon , por defecto será cero
     * @param aguante Es el aguante del pokemon
     * @return Estadisticas del pokemon
     */

    private String nombre;
    private String tipo;
    private int nivel;
    private int aguante;

// Añada los constructores********************

    /**
     * Contructor del Pokemon
     * @param nombre nombre pokemon
     * @param tipo tipo pokemon
     * @param nivel nivel del pokemon
     * @param aguante aguante del pokemo
     */

    public Pokemon(String nombre, String tipo, int nivel, int aguante) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.aguante = aguante = nivel;
    }

    /**
     * @param nombre
     * @param tipo
     */

    public Pokemon(String nombre, String tipo) {
        this.nivel = 1;
        this.aguante = nivel;
    }

    /**
     * Para poner por defecto el nivel
     * @param nivel El nivel pro defecto será cero
     */

    public Pokemon(int nivel) {
        this.nivel = nivel;
        Pokemon contrincante = new Pokemon(1);
    }

// ******************************************

    /**
     *
     * @return Para obtener el aguante
     */

    public int getAguante() {
        return aguante;
    }

    /**
     *
     * @return Para obtener el nombre
     */

    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @return Para obtener el tipo
     */

    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @return Para obtener el nivel
     */

    public int getNivel() {
        return nivel;
    }

    /**
     *
     * @return Para cambiar el nivel
     */

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     *
     * @return Para cambiar el aguante
     */

    public void setAguante(int aguante) {
        this.aguante = aguante;
    }

    /**
     *
     * @return Para cambiar el nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param contrincante , Oponente
     * @return mi intento de calcular el nivel del pokemon oponente...
     */

    public int calcularPoder(Pokemon contrincante) {
        int nivelMin = this.nivel * 3;
        int nivelMax = this.nivel * 10;

        int poder = (int) (Math.random() * (nivelMax - nivelMin + 1)) + nivelMin;

        return poder;
    }


    /**
     * Sube el nivel del pokemon
     */

    public void subirNivel() {
        this.nivel++;
        this.actualizarStats();
    }

    /**
     * Actualisa los stats
     */

    public void actualizarStats() {
        this.aguante = (int) Math.round(nivel * 2.5);
    }

    public void disminuirAguante() {
        this.aguante--;
    }

    public String toString() {
        return "Nombre: " + this.nombre +
                "\n tipo: " + this.tipo +
                "\n nivel: " + this.nivel +
                "\n aguante " + this.aguante;
    }
/*
    public  int calcularPoder(Pokemon jugador, Pokemon rival) {

    }

 */

}

/* Anotaciones */
//12+2*2(nivel)   15-2*2(nivel)
//Si ganaa es del mismo nivel , si pierde es del nivel oponente
//gana , sube 1 nivel y regenera aguante = nivel
// constructor llamar metodo de la clase?
