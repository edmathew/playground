package pt.ejpm.learn.drools.knowledge;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

/**
 *
 * @author edgar.mateus
 */
public class KnowledgeSessionHelper {

    public static KieContainer createRuleBase() {
        final KieServices ks = KieServices.Factory.get();
        return ks.getKieClasspathContainer();
    }

    public static StatelessKieSession getStatelessKnowledgeSession(final KieContainer kieContainer, final String sessionName) {
        return kieContainer.newStatelessKieSession(sessionName);
    }

    public static KieSession getStatefullKnowledgeSession(final KieContainer kieContainer, final String sessionName) {
        return kieContainer.newKieSession(sessionName);
    }

}
