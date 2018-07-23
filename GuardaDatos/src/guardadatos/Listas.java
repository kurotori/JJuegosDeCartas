
package guardadatos;

public class Listas {
    /**
     * Recibe un dato y lo guarda en la lista indicada, si no hay espacio en la lista
     * el método la reemplaza por una lista con longitud mayor.
     * @param dato Un String con el dato que se quiere guardar
     * @param lista La lista/array de tipo String donde se quiere guardar el dato
     */
    public void GuardarDato(String dato,String[] lista){
        //Se chequea si hay espacio en la lista
        if(HayEspacio(lista)){
            //Si la lista tiene espacio, se obtiene la posición disponible...
            int lugar=CualEspacio(lista);
            //...y se guarda el dato en esa posición.
            lista[lugar]=dato;
        }
        else{
            //Si no hay lugar en la lista, se agranda la lista
            lista=AgrandarLista(lista);
            //Se obtiene la primer posición disponible en la lista...
            int lugar=CualEspacio(lista);
            //...y se guarda el dato en esa posición.
            lista[lugar]=dato;
        }
    }
    
    /**
     * Crea una lista de tipo Strin con la longitud indicada.
     * @param espacios La longitud que se quiere que tenga la lista.
     * @return Una lista de tipo String con una longitud específica.
     */
    public String[] CrearLista(int espacios){
        //Se crea una lista de tipo String
        String[] lista;
        //Se la inicializa con una longitud definida por el valor 'espacios'
        lista = new String[espacios];
        //Se entrega la lista creada.
        return lista;
    }
    
    /**
     * Chequea si hay espacio en alguna posición de la lista indicada
     * @param lista Una lista de tipo String donde se debe chequear si
     * hay espacios disponibles
     * @return 'true' si hay espacio disponible, 'false' si no hay espacio
     */
    public boolean HayEspacio(String[] lista){
        //Se crea una variable de tipo boolean. Se la inicializa en false, pero
        //puede inicializarse en 'true', el valor se definirá de nuevo al final.
        boolean resultado=false;
        //Se obtiene la longitud de la lista.
        int longitud = lista.length;
        //Se recorre la lista...
        for(int posicion=0;posicion<longitud;posicion++){
            //...chequeando si el valor de cada posición es vacío o nulo
            //Se utiliza la función 'equals()' que se puede llamar desde
            //cualquier objeto de tipo String.
            if(lista[posicion].equals("")){
                //Si encuentra una posición vacía
                //establece el valor de 'resultado' en 'true'
                resultado=true;
                //Muestra un mensaje de cofirmación...
                System.out.println("La lista tiene lugar disponible");
                //...y termina el bucle con la sentencia 'break'...
                break;
            }            
            else{
                //...de lo contrario, el valor de 'resultad' es 'false'
                resultado=false;
            }
        }
        //Al finalizar el bucle se entrega el valor de 'resultado'
        return resultado;
    }
    
    /**
     * Busca una posición libre en la lista indicada
     * @param lista La lista de tipo String donde se quiere buscar una posición
     * libre.
     * @return Un valor int igual a la primera posición libre encontrada en la
     * lista, o -1 si no se encontraron posiciones disponibles.
     */
    public int CualEspacio(String[] lista){
        //Se declara una variable de tipo int para el resultado.
        int resultado=0;
        //Se obtiene la longitud de la lista.
        int longitud = lista.length;
        //Se recorre la lista...
        for(int posicion=0;posicion<longitud;posicion++){
            //...bucando una posición cuyo valor sea nulo o vacío.
            if(lista[posicion].equals("") ){
                //Si encuentra una posición vacía guarda el valor de la posición
                //en 'resultado'...
                resultado=posicion;
                //...muestra un mensaje de confirmación...
                System.out.println("Lugar disponible:"+posicion);
                //... y termina el bucle.
                break;
            }            
            else{
                //Si la posición no está vacía, 'resultado' se establece en -1
                resultado=-1;
            }
        }
        //Al finalizar el bucle se entrega el valor de 'resultado'
        return resultado;
    }
    
    /**
     * Entrega la cantidad de posiciones libres en una lista específica de tipo
     * String.
     * @param lista La lista de tipo String donde se desea buscar posiciones libres
     * @return La cantidad de posiciones libres disponibles en la lista o '0' si
     * no hay ninguno.
     */
    public int EspaciosLibres(String[] lista){
        int resultado = 0;
        int longitud = lista.length;
        for(int posicion=0; posicion < longitud; posicion++){
            if( lista[posicion].equals("") ){
                resultado++;
            }
        }
        return resultado;
    }
    
    
    
    /**
     * Devuelve una lista de tipo String nueva, con los mismos datos que otra lista
     * pero con una posición más.
     * @param lista La lista de tipo String original que se desea 'agrandar'
     * @return Una lista nueva con los mismos datos que la lista original pero con
     * una posición extra.
     */
    public String[] AgrandarLista(String[] lista){
        //Se obtiene la longitud de la lista original.
        int longitud = lista.length;
        //Se crea una nueva lista, pero con una posición más ('longitud' + 1).
        String[] nueva = CrearLista(longitud + 1);
        //Se recorre la lista original...
        for(int posicion = 0; posicion < longitud; posicion++){
            //...copiando sus datos a la lista nueva.
            nueva[posicion]=lista[posicion];
        }
        //Al finalizar el bucle, se entrega la lista nueva
        return nueva;
    }
    
    public void ModificarDato(int posicion, String datoNuevo, String[] lista){
        
    }
    
    public void BorrarDato(int posicion, String[] lista){
        
    }
    
    public void BorrarLista(String[] lista){
        
    }
}
