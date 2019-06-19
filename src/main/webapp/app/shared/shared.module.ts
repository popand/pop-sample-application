import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { PopSampleApplicationSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [PopSampleApplicationSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [PopSampleApplicationSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class PopSampleApplicationSharedModule {
  static forRoot() {
    return {
      ngModule: PopSampleApplicationSharedModule
    };
  }
}
