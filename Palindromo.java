public class Palindromo{
    private String texto;

    public Palindromo(){
        this.texto = "";
    }
    public Palindromo(String texto){
        this.setTexto(texto);
    }
    public String getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        if(texto == null){
            this.texto = "";
        }
        else{
            this.texto = texto;
        }
    }
    public boolean verificar(){
        String aux = texto.toLowerCase();
        aux = aux.replaceAll(" ","");
        if(this.texto.length() <= 1) return true;
        for(int i=0;i<aux.length()/2;i++){
            int pos2 = (aux.length()-1)-i;
            if(texto.charAt(i) != aux.charAt(pos2)) return false;
        }
        return true;
    }
}