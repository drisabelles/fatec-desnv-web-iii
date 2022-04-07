import { URI } from "../enuns/uri";
import Buscador from "./buscador";

export default class BuscadorClientes implements Buscador {
    public async buscar() {
        let json = await fetch(URI.CLIENTES).then(resposta => resposta.json())
        return json
    }
}