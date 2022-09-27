package ejercicios;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
    }

    @Override
    public void findAll() {
    }

    @Override
    public void delete() {
    }

    String save = "Aplicando método guardar";
    String findAll = "Aplicando método buscar";
    String delete = "Aplicando método borrar";

    @Override
    public String toString() {
        return "CocheCRUDImpl {" +
                "save= '" + save + '\'' +
                ", findAll= '" + findAll + '\'' +
                ", delete= '" + delete + '\'' +
                '}';
    }


}
