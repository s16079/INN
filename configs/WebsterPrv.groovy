/*
 * Copyright to the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.rioproject.config.Component
import sorcer.provider.boot.Booter

@Component("sorcer.tools.codeserver")
class WebsterProv {

    String[] getRoots() {
        String home = "${sorcer.home}"
        String libPath = home + "/lib"

        // webster root directories
        String sorcerLibPath = libPath + "/sorcer/lib"
        String sorcerLibDlPath = libPath + "/sorcer/lib-dl"
        String jiniLibPath = libPath + "/river"
        String rioLibDlPath = home + "/rio/lib-dl"
        String blitzLib = libPath + "/blitz"
        String httpData = home + "/data"
        String m2Repo = "${user.home}/.m2/repository"

    }

    String[] getOptions() {
        def options = []
        options << "-port"
        options << Booter.getWebsterPort()
        options << "-bindAddress"
        options << Booter.getWebsterInterface()
        options << "-startPort"
        options << Booter.getWebsterStartPort()
        options << "-endPort"
        options << Booter.getWebsterEndPort()
        options << "-isDaemon"
        options << Boolean.toString(false)
        options << "-debug"
        options << Boolean.toString(true)
        return options as String[]
    }
}