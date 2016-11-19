
public abstract class Aula{
    private String nombre;
    private Horario horario;


    public Aula(String nombre) {
        this.nombre = nombre;
        this.horario = new Horario();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Horario getHorario (){
        return horario;
    }
    
    public void setHorario (Horario horario){
        this.horario = horario;
    }
                
}
