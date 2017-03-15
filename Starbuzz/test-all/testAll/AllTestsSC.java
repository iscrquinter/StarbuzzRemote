package testAll;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testsc.TDarkRoast;
import testsc.TDecaf;
import testsc.TEspresso;
import testsc.THouseBlend;

@RunWith(Suite.class)
@SuiteClasses({ TDarkRoast.class, TDecaf.class, TEspresso.class, THouseBlend.class })
public class AllTestsSC {

}
