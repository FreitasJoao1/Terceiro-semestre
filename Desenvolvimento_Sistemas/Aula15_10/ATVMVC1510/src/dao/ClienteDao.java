package Terceiro-semestre.Desenvolvimento_Sistemas.Aula15_10.ATVMVC1510.src.dao;

public class ClienteDao {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void cadastrar(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> listar() {
        return clientes;
    }
    public Cliente buscar(int codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }

    public boolean alterar(int codigo, String nome, String email, String telefone) {
        Cliente cliente = buscar(codigo);

        if (cliente != null) {
            cliente.setNome(nome);
            cliente.setEmail(email);
            cliente.setTelefone(telefone);
            return true;
        }
        return false;
    }

    public boolean remover(int codigo) {
        Cliente cliente = buscar(codigo);

        if (cliente != null) {
            clientes.remove(cliente);
            return true;
        }
        return false;
    }
}
