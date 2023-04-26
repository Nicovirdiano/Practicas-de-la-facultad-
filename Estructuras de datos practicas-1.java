 
 //ESTRUCTURA DE DATOS TIPO LISTA:

/*Codigo en Java 
 La estructuras de datos pila y cola pueden ser implementadas con una estructura de datos lista enlazada.
 En esta última no hay limitante en cuanto al método de inserción y extracción de elementos.
 Estos pueden ser realizado al inicio, final o incluso podría ser insertado un elemento en una determinada posición de la lista.
 Las listas enlazadas simples contienen una única referencia a un elemento “siguiente”, es decir que cada nodo de la lista 
 tendrá sus datos y una sola referencia.
Una lista enlazada doble, ademas del valor costa de dos referencias una al nodo anterior y otra al nodo siguiente.*/
 
 // Definicion de clase con tres atributos

class Nodo {           
    
    private char valor;                          
    private Nodo siguiente;                     
    private Nodo anterior; 

 // Definicion de constructor para la clase Nodo                      
              
    
    public Nodo(){
        this.valor = ' ';
        this.siguiente = null;
        this.anterior = null;
    }
 //  retornar valor 
    public char obtenerValor() {
        return valor;
    }
 // setear valor  
    public void setearValor(char valor) {
        this.valor = valor;
    }
 // obtener valor de nodo siguiente
    public Nodo obtenerSiguiente() {
        return siguiente;
    }
 // setear valor 
    public void setearSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }   
 // obtener valor de nodo anterior
    public Nodo obtenerAnterior() {
        return anterior;
    }
 // setear valor
    public void setearAnterior(Nodo anterior) {
        this.anterior = anterior;
    }   
}


//Definicion de clase de Lista con su constructor 
 
class Lista {
    
    private Nodo inicio;
    private Nodo fin;
    private int longitud;
    
    public Lista(){
        inicio = null;
        fin = null;
        longitud = 0;
    }
    

    public boolean esVacia(){
        return inicio == null;
    }
    
    
    public int obtenerLongitud(){
        return longitud;
    }
    
    
    public void agregarAlFinal(char valor){
        
        Nodo nuevo = new Nodo();
        nuevo.setearValor(valor);
        
        if (esVacia()) {
            
            inicio = nuevo;
            fin = nuevo;
        
        } else
        {
            nuevo.setearAnterior(fin);
            fin.setearSiguiente(nuevo);
            fin = fin.obtenerSiguiente();

        }
        
        longitud++;
    }
   
   public void listarDesdeInicio(){
        
        if (!esVacia()) {
            
            Nodo aux = inicio;
            
            
            while(aux != null){
                
                System.out.print("[ " + aux.obtenerValor() + " ]" + " ->  ");
                aux = aux.obtenerSiguiente();
                
            }
        }
    }

    public void listarDesdeFin(){
        
        if (!esVacia()) {
            
            Nodo aux = fin;
                        
            while(aux != null){
                
                System.out.print("[ " + aux.obtenerValor() + " ]" + " ->  ");
                aux = aux.obtenerAnterior();
            }
        }
    }
}
/*  Codigo anterior en Phyton 

class Nodo:
    def __init__(self):
        self._valor = ' '
        self._siguiente = None
        self._anterior = None

    def obtener_valor(self):
        return self._valor

    def setear_valor(self, valor):
        self._valor = valor

    def obtener_siguiente(self):
        return self._siguiente

    def setear_siguiente(self, siguiente):
        self._siguiente = siguiente

    def obtener_anterior(self):
        return self._anterior

    def setear_anterior(self, anterior):
        self._anterior = anterior


class Lista:
    def __init__(self):
        self._inicio = None
        self._fin = None
        self._longitud = 0

    def es_vacia(self):
        return self._inicio == None

    def obtener_longitud(self):
        return self._longitud

    def agregar_al_final(self, valor):
        nuevo = Nodo()
        nuevo.setear_valor(valor)

        if self.es_vacia():
            self._inicio = nuevo
            self._fin = nuevo
        else:
            nuevo.setear_anterior(self._fin)
            self._fin.setear_siguiente(nuevo)
            self._fin = self._fin.obtener_siguiente()

        self._longitud += 1

    def listar_desde_inicio(self):
        if not self.es_vacia():
            aux = self._inicio

            while aux != None:
                print("[ " + str(aux.obtener_valor()) + " ]" + " ->  ", end="")
                aux = aux.obtener_siguiente()

    def listar_desde_fin(self):
        if not self.es_vacia():
            aux = self._fin

            while aux != None:
                print("[ " + str(aux.obtener_valor()) + " ]" + " ->  ", end="")
                aux = aux.obtener_anterior()


*/
        
        



//otro ejercicio continuacion en java
// Lista...

class Nodo {

    private int valor;
    private Nodo siguiente;
   
    public Nodo(){
    this.valor = 0;
    this.siguiente = null;
    }
   
    public int obtenerValor() {
    return valor;
    }
    public void setearValor(int valor) {
    this.valor = valor;
    }
    public Nodo obtenerSiguiente() {
    return siguiente;
    }
    public void setearSiguiente(Nodo siguiente) {
    this.siguiente = siguiente;
    }
   }
class Lista {

 private Nodo inicio;
 private int longitud;

 public Lista(){
 inicio = null;
 longitud = 0;
 }

 public boolean esVacia(){
 return inicio == null;
 }


 public int obtenerLongitud(){
 return longitud;
 }


 public void agregarAlFinal(int valor){

 Nodo nuevo = new Nodo();
 nuevo.setearValor(valor);

 if (esVacia()) {

 inicio = nuevo;

 } else
 {
 Nodo aux = inicio;
 while(aux.obtenerSiguiente() != null){
 aux = aux.obtenerSiguiente();
 }
 aux.setearSiguiente(nuevo);
 }

 longitud++;
 }


 public void agregarAlInicio(int valor){

 Nodo nuevo = new Nodo();
 nuevo.setearValor(valor);

 if (esVacia()) {

 inicio = nuevo;

 } else
 {
 nuevo.setearSiguiente(inicio);
 inicio = nuevo;
 }
 longitud++;
 }

 public void insertarPorReferencia(int referencia, int valor){

 Nodo nuevo = new Nodo();
 nuevo.setearValor(valor);

 if (!esVacia()) {

 if (buscar(referencia)) {

 Nodo aux = inicio;

 while (aux.obtenerValor() != referencia) {
 aux = aux.obtenerSiguiente();
 }

 Nodo siguiente = aux.obtenerSiguiente();

 aux.setearSiguiente(nuevo);
 nuevo.setearSiguiente(siguiente);

 longitud++;
 }
 }
 }

 public void insertarPorPosicion(int posicion, int valor){

 if(posicion>=0 && posicion<=longitud){
 Nodo nuevo = new Nodo();
 nuevo.setearValor(valor);

 if(posicion == 0){
 nuevo.setearSiguiente(inicio);
 inicio = nuevo;
 }
 else{

 if(posicion == longitud){
 Nodo aux = inicio;

 while(aux.obtenerSiguiente() != null){
 aux = aux.obtenerSiguiente();
 }

 aux.setearSiguiente(nuevo);
 }
 else{

 Nodo aux = inicio;

 for (int i = 0; i < (posicion-1); i++) {
 aux = aux.obtenerSiguiente();
 }

 Nodo siguiente = aux.obtenerSiguiente();
 aux.setearSiguiente(nuevo);
 nuevo.setearSiguiente(siguiente);
 }
 }

 longitud++;
 }
 }

 public int obtenerValor(int posicion) throws Exception{

 if(posicion>=0 && posicion<longitud){

 if (posicion == 0) {
 return inicio.obtenerValor();
 }else{
 Nodo aux = inicio;
 for (int i = 0; i < posicion; i++) {
 aux = aux.obtenerSiguiente();
 }
 return aux.obtenerValor();
 }

 } else {
 throw new Exception("Posicion inexistente en la lista.");
 }
 }

 public boolean buscar(int referencia){

 Nodo aux = inicio;
 boolean encontrado = false;
 while(aux != null && encontrado != true){

 if (referencia == aux.obtenerValor()){
 encontrado = true;
 }
 else{
 aux = aux.obtenerSiguiente();
 }
 }

 return encontrado;
 }

 public int obtenerPosicion(int referencia) throws Exception{

 if (buscar(referencia)) {

 Nodo aux = inicio;
 int cont = 0;

 while(referencia != aux.obtenerValor()){

 aux = aux.obtenerSiguiente();
 cont ++;
 }

 return cont;

 } else {
 throw new Exception("Valor inexistente en la lista.");
 }
 }

 public void editarPorReferencia(int referencia, int valor){

 if (buscar(referencia)) {

 Nodo aux = inicio;

 while(aux.obtenerValor() != referencia){
 aux = aux.obtenerSiguiente();
 }
 aux.setearValor(valor);
 }
 }

 public void editarPorPosicion(int posicion , int valor){

 if(posicion>=0 && posicion<longitud){

 if(posicion == 0){

 inicio.setearValor(valor);
 }
 else{
 Nodo aux = inicio;

 for (int i = 0; i < posicion; i++) {
 aux = aux.obtenerSiguiente();
 }

 aux.setearValor(valor);
 }
 }
 }

 public void removerPorReferencia(int referencia){

 if (buscar(referencia)) {

 if (inicio.obtenerValor() == referencia) {

 inicio = inicio.obtenerSiguiente();
 } else{

 Nodo aux = inicio;

 while(aux.obtenerSiguiente().obtenerValor() != referencia){
 aux = aux.obtenerSiguiente();
 }

 Nodo siguiente = aux.obtenerSiguiente().obtenerSiguiente();

 aux.setearSiguiente(siguiente);
 }
 longitud--;
 }
 }

 public void removerPorPosicion(int posicion){

 if(posicion>=0 && posicion<longitud){

 if(posicion == 0){

 inicio = inicio.obtenerSiguiente();
 }

 else{

 Nodo aux = inicio;
 for (int i = 0; i < posicion-1; i++) {
 aux = aux.obtenerSiguiente();
 }

 Nodo siguiente = aux.obtenerSiguiente();
 aux.setearSiguiente(siguiente.obtenerSiguiente());
 }
 longitud--;
 }
 }

 public void eliminar(){

 inicio = null;
 longitud = 0;
 }

 public void listar(){

 if (!esVacia()) {

 Nodo aux = inicio;
 int i = 0;

 while(aux != null){

 System.out.print(i + ".[ " + aux.obtenerValor() + " ]" + " -> ");
 aux = aux.obtenerSiguiente();
 i++;
 }
 }
 }
}


