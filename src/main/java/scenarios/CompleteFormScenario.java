package scenarios;

import actions.FormPageObject;
import repository.RepositoryFormApplication;

public class CompleteFormScenario {

    private final FormPageObject formPageObject;
    private final RepositoryFormApplication repositoryFormApplication;

    public CompleteFormScenario(FormPageObject formPageObject, RepositoryFormApplication repositoryFormApplication) {
        this.formPageObject = formPageObject;
        this.repositoryFormApplication = repositoryFormApplication;
    }

    public void completeFormMultipleTimes(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            formPageObject.setFirstNameInputField(repositoryFormApplication.getFirstName(i));
            formPageObject.setLastNameInputField(repositoryFormApplication.getLastName(i));
            formPageObject.setDateInputField(repositoryFormApplication.getDate(i));
            formPageObject.selectMaleObject();
            formPageObject.setYearsOfExperience(i);
            formPageObject.clickSubmitButtonForm();
            if (i < numberOfTimes - 1) {
                formPageObject.clearFirstNameInputField();
                formPageObject.clearLastNameInputField();
                formPageObject.clearDateInputField();
            }
        }
    }
}
