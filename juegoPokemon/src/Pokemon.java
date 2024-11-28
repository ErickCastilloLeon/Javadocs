public class Pokemon {

    private String nombre;
    private String tipo;
    private int nivel;
    private int aguante;

// Añada los constructores********************

    public Pokemon(String nombre, String tipo, int nivel, int aguante) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.aguante = aguante = nivel;
    }

    public Pokemon(String nombre, String tipo) {
        this.nivel = 1;
        this.aguante = nivel;
    }

    public Pokemon(int nivel) {
        this.nivel = nivel;
        Pokemon contrincante = new Pokemon(1);
    }

// ******************************************

    public int getAguante() {
        return aguante;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setAguante(int aguante) {
        this.aguante = aguante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int calcularPoder(Pokemon contrincante) {
        int nivelMin = this.nivel * 3;
        int nivelMax = this.nivel * 10;

        int poder = (int) (Math.random() * (nivelMax - nivelMin + 1)) + nivelMin;

        return poder;
    }


    public void subirNivel() {
        this.nivel++;
        this.actualizarStats();
    }

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
