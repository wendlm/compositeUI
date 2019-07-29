class Navbar extends HTMLElement {

    constructor() {
        super();
        this.attachShadow({mode: "open"});
    }

    connectedCallback() {
        fetch("/shop-navbar").then(
            async (resp) => {
                this.shadowRoot.innerHTML = await resp.text();
            }
        )
    }
}

window.customElements.define("nav-bar", Navbar);