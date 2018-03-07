public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private String paginaWeb;
    private String direccionIP;
    private String codigo;
    
    /**
     * Constructor para objetos de la clase Acceso..
     */
    public Acceso(String datosDeAccesoAlServidor)
    {
        String[] datosDeAccesoSeparados = datosDeAccesoAlServidor.split(" ");
        ano = Integer.parseInt(datosDeAccesoSeparados[1].substring(1,5));
        mes = Integer.parseInt(datosDeAccesoSeparados[2]);
        dia = Integer.parseInt(datosDeAccesoSeparados[3]);
        hora = Integer.parseInt(datosDeAccesoSeparados[4]);
        minutos = Integer.parseInt(datosDeAccesoSeparados[5].substring(0,2));
        paginaWeb = datosDeAccesoSeparados[6];
        direccionIP = datosDeAccesoSeparados[0];
        codigo = datosDeAccesoSeparados[7];
    }
    
    /**
     */
    public int getAno() 
    {
        return ano;
    }
    
    /**
     */    
    public int getMes()
    {
        return mes;
    }
    
    /**
     */    
    public int getDia()
    {
        return dia;
    }
    
    /**
     */    
    public int getHora()
    {
        return hora;
    }
    
    /**
     */    
    public int getMinutos()
    {
        return minutos;
    }
    
    /**
     */
    public String getPaginaWeb() {
        return paginaWeb;
    }
    
    /**
     */
    public String getDireccionIP() {
        return direccionIP;
    }
    
    /**
     */
    public String getCodigo() {
        return codigo;
    }    
}public void fun1B()
