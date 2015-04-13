/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Juan David Zapata Y Andres Barragan
 */
public class Filosofo {
    	private String filosofo;
	private int[] tiempo;
        

	public Filosofo(String filosofo, int[] tiempo){
            this.filosofo = filosofo;
            this.tiempo = tiempo;
        }

    public String getFilosofo() {
        return filosofo;
    }

    public int[] getTiempo() {
        return tiempo;
    }

    public void setFilosofo(String filosofo) {
        this.filosofo = filosofo;
    }

    public void setTiempo(int[] tiempo) {
        this.tiempo = tiempo;
    }
}
