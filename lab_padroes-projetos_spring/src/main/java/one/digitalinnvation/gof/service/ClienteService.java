package one.digitalinnvation.gof.service;

import one.digitalinnvation.gof.model.Cliente;


/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 *
 * @author PedroZef
 */

public interface ClienteService {

    static Iterable<Cliente> buscarTodos() {
        
        return null;
    }
        


    static Cliente buscarPorId(Long id) {
    
        return null;
    }

    static void inserir(Cliente cliente) {

    }

    static void atualizar(Long id, Cliente cliente) {
         
    }

    void deletar(Long id);

}
