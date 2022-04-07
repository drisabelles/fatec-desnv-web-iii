/* eslint-disable jsx-a11y/anchor-is-valid */
import { Component } from "react";
import CadastradorCliente from "../cadastradores/cadastradorCliente";


class FormularioCliente extends Component {
    private nome: string
    private nomeSocial: string

    constructor(props) {
        super(props)
        this.capturarNome = this.capturarNome.bind(this)
        this.capturarNomeSocial = this.capturarNomeSocial.bind(this)
        this.submeterFormulario = this.submeterFormulario.bind(this)
        this.cadastrarCliente = this.cadastrarCliente.bind(this)
    }

    public cadastrarCliente(objeto: Object) {
        let cadastrador = new CadastradorCliente()
        cadastrador.cadastrar(objeto)
    }

    public capturarNome(evento: any) {
        this.nome = evento.target.value
    }

    public capturarNomeSocial(evento: any) {
        this.nomeSocial = evento.target.value
    }

    public submeterFormulario(evento: any) {
        evento.preventDefault()
        let cliente = {
            nome: this.nome,
            nomeSocial: this.nomeSocial
        }
        this.cadastrarCliente(cliente)
        evento.target.reset()
    }

    render() {
        return (
            <>
                <div className="col s12 m7">
                    <div className="card horizontal">
                        <div className="card-stacked">
                            <form className="col s12" onSubmit={(e) => this.submeterFormulario(e)}>
                                <div className="card-content">
                                    <div className="row">
                                        <div className="input-field col s6">
                                            <input onChange={this.capturarNome} id="nome" type="text" className="validate active" maxLength={30} />
                                            <label htmlFor="nome">Nome</label>
                                        </div>
                                        <div className="input-field col s6">
                                            <input onChange={this.capturarNomeSocial} id="nomeSocial" type="text" className="validate" maxLength={30} />
                                            <label htmlFor="nomeSocial">Nome social</label>
                                        </div>
                                    </div>
                                </div>
                                <div className="card-action">
                                    <button className="btn waves-effect waves-light teal accent-3" type="submit" name="action">Cadastrar
                                        <i className="material-icons right">send</i>
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </>
        )
    }
}
export default FormularioCliente