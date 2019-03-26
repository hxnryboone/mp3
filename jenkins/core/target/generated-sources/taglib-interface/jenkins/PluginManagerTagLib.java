
package jenkins;

import java.util.Map;
import groovy.lang.Closure;
import org.kohsuke.stapler.jelly.groovy.TagLibraryUri;
import org.kohsuke.stapler.jelly.groovy.TypedTagLibrary;

@TagLibraryUri("/hudson/PluginManager")
public interface PluginManagerTagLib
    extends TypedTagLibrary
{


    /**
     * 
     */
    void installed(Map args, Closure body);

    /**
     * 
     */
    void installed(Closure body);

    /**
     * 
     */
    void installed(Map args);

    /**
     * 
     */
    void installed();

    /**
     * 
     */
    void sites(Map args, Closure body);

    /**
     * 
     */
    void sites(Closure body);

    /**
     * 
     */
    void sites(Map args);

    /**
     * 
     */
    void sites();

    /**
     * 
     */
    void check(Map args, Closure body);

    /**
     * 
     */
    void check(Closure body);

    /**
     * 
     */
    void check(Map args);

    /**
     * 
     */
    void check();

    /**
     * 
     */
    void available(Map args, Closure body);

    /**
     * 
     */
    void available(Closure body);

    /**
     * 
     */
    void available(Map args);

    /**
     * 
     */
    void available();

    /**
     * 
     */
    void table(Map args, Closure body);

    /**
     * 
     */
    void table(Closure body);

    /**
     * 
     */
    void table(Map args);

    /**
     * 
     */
    void table();

    /**
     * 
     */
    void checkUpdates(Map args, Closure body);

    /**
     * 
     */
    void checkUpdates(Closure body);

    /**
     * 
     */
    void checkUpdates(Map args);

    /**
     * 
     */
    void checkUpdates();

    /**
     * 
     */
    void advanced(Map args, Closure body);

    /**
     * 
     */
    void advanced(Closure body);

    /**
     * 
     */
    void advanced(Map args);

    /**
     * 
     */
    void advanced();

    /**
     * 
     */
    void _api(Map args, Closure body);

    /**
     * 
     */
    void _api(Closure body);

    /**
     * 
     */
    void _api(Map args);

    /**
     * 
     */
    void _api();

    /**
     * 
     */
    void index(Map args, Closure body);

    /**
     * 
     */
    void index(Closure body);

    /**
     * 
     */
    void index(Map args);

    /**
     * 
     */
    void index();

    /**
     * 
     */
    void tabBar(Map args, Closure body);

    /**
     * 
     */
    void tabBar(Closure body);

    /**
     * 
     */
    void tabBar(Map args);

    /**
     * 
     */
    void tabBar();

}
