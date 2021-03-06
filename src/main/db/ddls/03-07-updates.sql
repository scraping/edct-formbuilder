/*L
  Copyright HealthCare IT, Inc.

  Distributed under the OSI-approved BSD 3-Clause License.
  See http://ncip.github.com/edct-formbuilder/LICENSE.txt for details.
L*/

ALTER TABLE "FormBuilder".question_categries DROP CONSTRAINT "fk_questionId_question_categories";

ALTER TABLE "FormBuilder".question_categries
  ADD CONSTRAINT "fk_questionId_form_element_categories" FOREIGN KEY (question_id)
      REFERENCES "FormBuilder".form_element (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION;