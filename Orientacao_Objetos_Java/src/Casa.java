public class Casa {
    boolean inteligente;

    public Casa(){
        
    }
    public Casa(boolean inteligente){
        this.inteligente = inteligente;
    }

    void acenderLuz(){
        if (inteligente) {
            System.out.println("Comando de voz.");
        } else {
            System.out.println("Pressionar interruptor.");
        }
    }
}
