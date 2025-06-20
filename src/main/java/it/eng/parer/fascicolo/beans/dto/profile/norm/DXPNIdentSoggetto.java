/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna <p/> This program is free software: you can
 * redistribute it and/or modify it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the License, or (at your option)
 * any later version. <p/> This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Affero General Public License for more details. <p/> You should
 * have received a copy of the GNU Affero General Public License along with this program. If not,
 * see <https://www.gnu.org/licenses/>.
 */

package it.eng.parer.fascicolo.beans.dto.profile.norm;

import java.io.Serializable;

import io.smallrye.common.constraint.Assert;
import it.eng.parer.fascicolo.beans.dto.profile.IIdentSoggetto;

public class DXPNIdentSoggetto implements IIdentSoggetto, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1124864128722561737L;
    String codice;
    String tipo;

    @Override
    public String getCodice() {
	return codice;
    }

    @Override
    public void setCodice(String codice) {
	Assert.assertNotNull(codice);
	this.codice = codice;
    }

    @Override
    public String getTipo() {
	return tipo;
    }

    @Override
    public void setTipo(String tipo) {
	Assert.assertNotNull(tipo);
	this.tipo = tipo;
    }

    @Override
    public boolean isPredefined() {
	return true;
    }

    @Override
    public String toString() {
	return "DXPNIdentSoggetto [" + (codice != null ? "codice - " + codice + ", " : "")
		+ (tipo != null ? "tipo - " + tipo : "") + "]";
    }

}
