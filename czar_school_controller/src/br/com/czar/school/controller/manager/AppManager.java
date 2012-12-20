package br.com.czar.school.controller.manager;

import org.mentabean.DBTypes;
import org.mentawai.core.ApplicationManager;

import br.com.czar.school.model.beans.Aluno;
import br.com.czar.school.model.beans.Endereco;

public class AppManager extends ApplicationManager {
	@Override
	public void loadBeans() {
		bean(Endereco.class, "endereco");
		
		bean(Aluno.class, "aluno")
		.pk("id", DBTypes.AUTOINCREMENT)
		.field("nome", DBTypes.STRING)
		.field("endereco.id", "id", DBTypes.LONG);
	}
}
