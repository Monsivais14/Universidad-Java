
package enumeraciones;

public enum Continentes {
    
    //atributos de continentes, entre sus () esta el numero de paises del continente
    AFRICA(53),
    EUROPA(46),
    AMERICA(34),
    OCEANIA(14),
    ASIA(44);
    
    /*
    el valor entre los parentesis es como si fuera parte del constructor 
    entonces al hacer una consulta se puede acceder al parametro instanciado
    a el atributo con un getter e instanciarlo desde su mismo atributo pero
    siempre y cuando concuerde a los parametros requeridos por el constructor
    */
    
    private final int paises;
    
    private Continentes(int paises) {
        /*
        aqui es donde se 
        */
        this.paises = paises;
    }

    public int getPaises(){
        /*
        metodo para obtener paises de un atributo enum
        */
        return this.paises;
    }
    
    /*
    enumeracion con valores:
    
    se le puede proporcionar un atributo 
    
    */
    
}
