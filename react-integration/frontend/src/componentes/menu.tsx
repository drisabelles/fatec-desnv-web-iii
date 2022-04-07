/* eslint-disable jsx-a11y/anchor-is-valid */
import { Component } from "react";
import 'materialize-css/dist/css/materialize.min.css'
import M from 'materialize-css'
import Botao from "./botao";

type props = {
    selecionarBotao: Function
}

class Menu extends Component<props> {

    componentDidMount() {
        document.addEventListener('DOMContentLoaded', function () {
            let elems = document.querySelectorAll('.fixed-action-btn');
            M.FloatingActionButton.init(elems, {
                direction: 'left'
            });
        })
    }

    render() {
        return (
            <div>
                <div className="fixed-action-btn">
                    <a className="btn-floating btn-large teal accent-3">
                        <i className="material-icons">person_add</i>
                    </a>
                    <ul>
                        <Botao nome="cadastrar" icon="add" selecionarBotao={this.props.selecionarBotao} />
                        <Botao nome="clientes" icon="people" selecionarBotao={this.props.selecionarBotao} />
                    </ul>
                </div>
            </div>
        )
    }
}
export default Menu