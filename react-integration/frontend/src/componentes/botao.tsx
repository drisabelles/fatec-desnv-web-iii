/* eslint-disable jsx-a11y/anchor-is-valid */
import { Component } from "react";
import 'materialize-css/dist/css/materialize.min.css'

type props = {
    nome: string,
    icon: string,
    selecionarBotao: Function
}

class Botao extends Component<props> {
    constructor(props) {
        super(props)
        this.capturarClique = this.capturarClique.bind(this)
    }

    public capturarClique() {
        this.props.selecionarBotao(this.props.nome)
    }

    render() {
        return (
            <li>
                <a className="btn-floating teal accent-3" onClick={this.capturarClique}>
                    <i className="material-icons">{this.props.icon}</i>
                </a>
            </li>
        )
    }
}
export default Botao