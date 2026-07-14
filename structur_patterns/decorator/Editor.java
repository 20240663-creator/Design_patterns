package structur_patterns.decorator;

public class Editor {
    public void openProject(String path) {
        Component[] artefacts = {
                new IsMain(new Artefact("Main")),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new HasError(new Artefact("EmailProvider")),
        };

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
