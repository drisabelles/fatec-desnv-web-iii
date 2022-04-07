import RemovedorLocal from "./removedorLocal";

export default class RemovedorClienteLocal implements RemovedorLocal {
    public remover(objeto: Object[], id: string): Object[] {
        let clientes = objeto.filter(elemento => elemento['id'] !== id)
        return clientes
    }
}