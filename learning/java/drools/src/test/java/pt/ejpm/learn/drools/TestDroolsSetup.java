package pt.ejpm.learn.drools;

import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import pt.ejpm.learn.drools.knowledge.KnowledgeSessionHelper;

/**
 *
 * @author edgar.mateus
 */
public class TestDroolsSetup {

    private static KieContainer kieContainer;

    @BeforeClass
    public static void beforeClass() {
        kieContainer = KnowledgeSessionHelper.createRuleBase();
    }

    @Test
    public void shouldBeAbleToCallASession() {
        final KieSession session = KnowledgeSessionHelper.getStatefullKnowledgeSession(kieContainer, "ksession-rules");
        session.fireAllRules();
    }
}
