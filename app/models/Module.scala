package models

import com.google.inject.AbstractModule
import services.Init

class Module extends AbstractModule{
  override def configure() = {
    bind(classOf[Init]).asEagerSingleton
  }
}
