package com.sifatsdroid.U_GRE;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Toast;

import com.sifatsdroid.flingswipe.SwipeFlingAdapterView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MyActivity extends Activity {


    private ArrayList<String> al;

    private ArrayAdapter arrayAdapter;
    private int i = 0;
    public String[] mStrings = new String[300];

    public String[] A_words = {
            "Abate",
            "To reduce in amount, degree, or severity",
            "Abscond",
            "To leave secretly",
            "Abstain",
            "To choose not to do something",
            "Abyss",
            "An extremely deep hole",
            "Adulterate",
            "To make impure",
            "Advocate",
            "To speak in favor of",
            "Aesthetic",
            "Concerning the appreciation of beauty",
            "Aggrandize",
            "To increase in power, influence, and reputation",
            "Alleviate",
            "To make more bearable",
            "Amalgamate",
            "To combine, mix together",
            "Ambiguous",
            "Doubtful or uncertain; able to be interpreted in many ways",
            "Ameliorate",
            "To make better; to improve",
            "Anachronism",
            "Something out of place in time"
    };
    public String[] B_words = {
            "Banal", "Predictable, cliched, boring",
            "Blight",
            "Any plant disease resulting in withering without rotting",


            "Bolster", "To support; to prop up",
            "Bombastic", "Pompous in speech and manner",
            "Burnish",
            "Polish and make shiny"};

    public String[] C_words = {
            "Cacophony", "Harsh, jarring noise",
            "Candid", "Impartial and honest in speech",
            "Capricious", "Changing one's mind quickly and often",
            "Castigate", "To punish or criticize harshly",
            "Catalyst", "Something that brings about a change in something else",
            "Caustic", "Biting in wit",
            "Chaos", "Great disorder and confusion",
            "Chauvinist", "Someone prejudiced in favor of a group to which he or she ",
            "Chicanery", "Deception by means of craft or guile",
            "Cogent", "Convincing and well reasoned",
            "Condone", "To overlook, pardon, or disregard",
            "Convoluted", "Intricate and complicated",
            "Corroborate", "To provide supporting evidence",
            "Credulous", "Too trusting, gullible",
            "Crescendo", "Steadily increasing volume, or force"};


    public String[] D_words = {
            "Decorum", "Appropriateness of behavior or conduct, propriety",
            "Deference", "Respect, courtesy",
            "Deride", "To speak of or treat with contempt;to mock",
            "Desiccate", "To dry out thoroughly",
            "Desultory", "Jumping from one thing to another, disconnected",
            "Diatribe", "An abusive, condemnatory speech",
            "Diffident", "Lacking self-confidence",
            "Dilate", "To make large, to expand",
            "Dilatory", "Intended to delay",
            "Dilettante", "Someone who has amateurish and superficial interest in a topic",
            "Dirge", "A funeral hymn or mournful speech",
            "Disabuse", "To set right, to free from error",
            "Discern", "To perceive, to recognize",
            "Disparate", "Fundamentally different; entirely unlike",
            "Dissemble", "To present a false appearance; To disguise one's real intentions or character",
            "Dissonance", "A harsh and disagreeable combination; often of sounds",
            "Dogma", "A firmly held opinion, often a religious belief",
            "Dogmatic", "Dictatorial in one's opinions",
            "Dupe", "To deceive; a person who is easily deceived"};
    public String[] E_words = {
            "Eclectic", "Selecting from or made up from a variety of sources",
            "Efficacy", "Effectiveness",
            "Elegy", "A sorrowful poem or speech",
            "Eloquent", "Persuasive and moving, especially in speech",
            "Emulate", "To copy, or try to equal or excel",
            "Enervate", "To reduce in strength",
            "Engender", "To produce,cause or bring about",
            "Enigma", "A puzzle, a mystery",
            "Enumerate", "To count, list, or itemize",
            "Ephemeral", "Lasting a short time",
            "Equivocate", "To use expressions of double meaning in order to mislead",
            "Erratic", "Wandering and unpredictable",
            "Erudite", "Learned, scholarly, bookish",
            "Esoteric", "Known or understood by only a few",
            "Estimable", "Admirable",
            "Eulogy", "Speech in praise of someone",
            "Euphemism", "Use of an inoffensive word or phrase in place of a more distasteful one",
            "Exacerbate", "To make worse",
            "Exculpate", "Yo clear from blame; prove innocent",
            "Exigent", "Urgent, requiring immediate action",
            "Exonerate", "To clear of blame",
            "Explicit", "Clearly stated or shown; forthright in expression"};
    public String[] F_words = {
            "Fanatical", "Acting excessively enthusiastic; filled with extreme unquestioned devotion",
            "Fawn", "To grovel",
            "Fervid", "Intensely emotional; feverish",
            "Florid", "Excessively decorated or embellished",
            "Foment", "To arouse or incite",
            "Frugality", "A tendency to be thrifty or cheap"};
    public String[] G_words = {
            "Garrulous", "Tending to talk alot",
            "Gregarious", "Outgoing, sociable",
            "Guile", "Deceit of trickery",
            "Gullible", "Easily Deceived"};
    public String[] H_words = {

            "Hackneyed", "Unoriginal and trite",
            "Harangue", "a Loud bombastic declamation expressed with strong emotion",
            "Homogeneous", "Of a similar kind"


    };
    public String[] I_words = {

            "Iconoclast", "One who opposes established beliefs, customs, and institutions",
            "Imperturbable", "Not capable of being disturbed",
            "Impervious", "Impossible to penetrate; incapable of being affected",
            "Impetuous", "Quick to act without thinking",
            "Implacable", "Unable to be calmed down or made peaceful",
            "Inchoate", "Not fully formed, disorganized",
            "Ingenuous", "Showing innocence or childlike simplicity",
            "Inimical", "Hostile, unfriendly",
            "Innocuous", "Harmless",
            "Insipid", "Lacking interest of flavor",
            "Intransigent", "Uncompromising, refusing to be reconciled",
            "Inundate", "To overwhelm to cover with water",
            "Irascible", "Easily made angry",


    };
    public String[] J_words = {
            "Jargon",
            "Technical terminology characteristic of a particular subject",
            "Jettison",
            "Throw away, of something encumbering",
            "Jingoism",
            "Fanatical patriotism",
            "Jocular",
            "Characterized by jokes and good humor",
            "Judicious",
            "Marked by the exercise of good judgment in practical matters",
            "Juncture",
            "The shape or manner in which things come together",
    };
    public String[] K_words = {
            "Keen",
            "Intense or sharp",
            "Kindle",
            "Catch fire",
            "Kinetic",
            "Relating to the motion of material bodies and their forces",
            "Knell",
            "The sound of a bell rung slowly to announce a death",
            "Kudos",
            "An expression of approval and commendation"};
    public String[] L_words = {
            "Laconic", "Using few words",
            "Lament", "To express sorrow or grieve",
            "Laud", "To give praise, to glorify",
            "Lavish", "To give unsparingly; extremely generous or extravagant",
            "Lethargic", "Acting in an indifferent or slow, sluggish manner",
            "Loquacious", "Talkative",
            "Lucid", "clear and easily understood",
            "Luminous", "Bright, brilliant, glowing",};
    public String[] M_words = {
            "Malinger", "To evade responsibility by pretending to be ill",
            "Malleable", "Capable of being shaped",
            "Metaphor", "a figure of speech comparing two different things; a symbol",
            "Meticulous", "Extremely careful about details",
            "Misanthrope", "a person who dislikes others",
            "Mitigate", "To soften, or lessen",
            "Mollify", "to calm or make less severe",
            "Monotony", "lack of variation"};
    public String[] N_words = {
            "Nadir",
            "The lowest point of anything",
            "Naive",
            "Marked by or showing unaffected simplicity",
            "Nascent",
            "Being born or beginning",
            "Neologism",
            "A newly invented word or phrase",
            "Neophyte",
            "Any new participant in some activity",
            "Nettle",
            "Plant having stinging hairs that cause skin irritation",
            "Noisome",
            "Causing or able to cause nausea",
            "Nominal",
            "Relating to or constituting or bearing or giving a name",
            "Nuance",
            "A subtle difference in meaning or opinion or attitude",
            "Numismatics",
            "The collection and study of money (and coins in particular)"
    };
    public String[] O_words = {
            "Obdurate", "Hardened in feeling, resistant to persuasion",
            "Obsequious", "Overly submissive and eager to please",
            "Obstinate", "Stubborn, unyielding",
            "Obviate", "To prevent, to make unnecessary",
            "Occlude", "To stop up; to prevent the passage of",
            "Onerous", "Troublesome and oppressive,; burdensome",
            "Opaque", "Impossible to see through; preventing the passage of light",
            "Opprobrium", "Public disgrace",
            "Ostentation", "Excessive showiness"

    };
    public String[] P_words = {

            "Paradox", "A contradiction or dilemma",
            "Paragon", "Model of excellence or perfection",
            "Pedant", "Someone who shows off learning",
            "Perfidious", "Willing to betray one's trust",
            "Perfunctory", "Done in a routine day, indifferent",
            "Permeate", "To penetrate",
            "Philanthropy", "Charity; a desire or effort to promote goodness",
            "Placate", "To soothe or pacify",
            "Plastic", "Able to be molded, altered, or bent",
            "Plethora", "Excess",
            "Pragmatic", "Practical as opposed to idealistic",
            "Precipitate", "To throw violently or bring about abruptly lacking deliberation",
            "Prevaricate", "To lie of deviate from the truth",
            "Pristine", "Fresh and clean; uncorrupted",
            "Prodigal", "Lavish, wasteful",
            "Proliferate", "To increase in number quickly",
            "Propitiate", "To conciliate; to appease",
            "Propriety", "Correct behavior; obedience to rules and customs",
            "Prudence", "Wisdom, caution, or restraint",
            "Pungent", "Sharp and irritating to the senses",


    };
    public String[] Q_words = {

            "Querulous",
            "Habitually complaining",
            "Quiescent",
            "Being quiet or still or inactive",
            "Quixotic",
            "Not sensible about practical matters",
            "Quotidian",
            "Found in the ordinary course of events"

    };
    public String[] R_words = {

            "Rarefy", "To make things thinner or sparser",
            "Repudiate", "To reject the validity of",
            "Reticent", "Silent, reserved",
            "Rhetoric", "Effective writing or speaking",
            "Rejoinder",
            "A quick reply to a question or remark",

            "Replete",
            "Filled to satisfaction with food or drink",
            "Repose",
            "Freedom from activity",
            "Repudiate",
            "Refuse to acknowledge, ratify, or recognize as valid",
            "Requite",
            "Make repayment for or return something",
            "Ribald",
            "Humorously vulgar",
            "Rococo",
            "Having excessive asymmetrical ornamentation",
            "Rustic",
            "Characteristic of rural life",

    };
    public String[] S_words = {

            "Sagacious",
            "Acutely insightful and wise",
            "Salient",
            "Having a quality that thrusts itself into attention",

            "Sanguine",
            "Confidently optimistic and cheerful",

            "Satiate", "To satisfy fully or overindulge",
            "Seraphic",
            "Having a sweet nature befitting an angel",
            "Sinecure",
            "A job that involves minimal duties",
            "Slake",
            "Satisfy, as thirst",
            "Soporific", "Causing sleep or lethargy",
            "Specious", "Deceptively attractive; seemingly plausible but fallacious",
            "Stasis",
            "Inactivity resulting from a balance between opposing forces",

            "Stigma", "A mark of shame or discredit",
            "Stolid", "Unemotional, lacking sensitivity",
            "Sublime", "Lofty or grand",
            "Symbiosis",
            "The relation between two interdependent species of organisms"

    };
    public String[] T_words = {

            "Tacit", "Done without using words",
            "Taciturn", "Silent, not talkative",

            "Terrestrial",
            "Of or relating to or characteristic of the planet Earth",


            "Tirade", "Long harsh speech or verbal attack",
            "Toady",
            "A person who tries to please someone to gain an advantage",
            "Torpor", "Extreme mental of physical sluggishness",
            "Transitory", "Temporary, lasting a brief time",

            "Turgid",
            "Ostentatiously lofty in style",
            "Tyro",
            "Someone new to a field or activity",

    };
    public String[] U_words = {

            "Umbrage",
            "A feeling of anger caused by being offended",
            "Unconscionable",
            "Greatly exceeding bounds of reason or moderation",
            "Unequivocal",
            "Admitting of no doubt or misunderstanding",
            "Upbraid",
            "Express criticism towards",
            "Usury",
            "The act of lending money at an exorbitant rate of interest",
            "Vacillate",
            "Be undecided about something"
    };
    public String[] V_words = {

            "Vacillate", "To sway physically; to be indecisive",
            "Venerate", "To respect deeply",
            "Veracity", "Filled with truth and accuracy",
            "Verbose", "Wordy",
            "Vex", "To annoy",

            "Vim",
            "A healthy capacity for vigorous activity",
            "Viscous",
            "Having a relatively high resistance to flow",


            "Volatile", "Easily aroused or changeable;lively or explosive"

    };
    public String[] W_words = {


            "Wanton",
            "Lewd or lascivious woman",
            "Waver",
            "Pause or hold back in uncertainty or unwillingness",
            "Whimsical",
            "Determined by chance or impulse rather than by necessity",

            "Winsome",
            "Charming in a childlike or naive way",
            "Wizened",
            "Lean and wrinkled by shrinkage as from age or illness",
            "Wraith",
            "A mental representation of some haunting experience",
    };
    public String[] X_words = {
            "Xenophobia",
            "A fear of foreigners or strangers"
    };
    public String[] Y_words = {
            "Yoke",
            "Support consisting of a wooden frame across the shoulders"
    };
    public String[] Z_words = {

            "Zeal",
            "A feeling of strong eagerness",
            "Zealot",
            "A fervent and even militant proponent of something",

    };


    @InjectView(R.id.frame)
    SwipeFlingAdapterView flingContainer;

    Button header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ButterKnife.inject(this);
        final int click = getIntent().getIntExtra("click", 0);


        al = new ArrayList<>();

        if (click == 1) {
            for (int n = 0; n < A_words.length; n++) {
                al.add(A_words[n]);
            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemblue, R.id.helloText, al);
//        al.add("Abate");
//        al.add("To reduce in amount, degree, or severity");
//        al.add("Abscond");
//        al.add("To leave secretly");
//        al.add("Abstain");
//        al.add("To choose not to do something");
//        al.add("Abyss");
//        al.add("An extremely deep hole");
//        al.add("Adulterate");
//        al.add(" To make impure");
//        al.add("Advocate");
//        al.add("To speak in favor of");
//        al.add("Aesthetic");
//        al.add("Concerning the appreciation of beauty");
//        al.add("Aggrandize");
//        al.add("To increase in power, influence, and reputation");
//        al.add(" Alleviate");
//        al.add("To make more bearable");
//        al.add(" Amalgamate");
//        al.add(" To combine, mix together");
//        al.add(" Ambiguous");
//        al.add("Doubtful or uncertain; able to be interpreted in many ways");
//        al.add("Ameliorate");
//        al.add("To make better; to improve");
//        al.add("Anachronism");
//        al.add("Something out of place in time");


        } else if (click == 2) {
            for (int n = 0; n < B_words.length; n++) {
                al.add(B_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemgreen, R.id.helloText, al);

        } else if (click == 3) {
            for (int n = 0; n < C_words.length; n++) {
                al.add(C_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.item, R.id.helloText, al);


        } else if (click == 4) {
            for (int n = 0; n < D_words.length; n++) {
                al.add(D_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemviolet, R.id.helloText, al);




        } else if (click == 5) {
            for (int n = 0; n < E_words.length; n++) {
                al.add(E_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemred, R.id.helloText, al);


        } else if (click == 6) {
            for (int n = 0; n < F_words.length; n++) {
                al.add(F_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemdarkblue, R.id.helloText, al);


        } else if (click == 7) {
            for (int n = 0; n < G_words.length; n++) {
                al.add(G_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemdarkred, R.id.helloText, al);


        } else if (click == 8) {
            for (int n = 0; n < H_words.length; n++) {

                al.add(H_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemdarkgreen, R.id.helloText, al);


        } else if (click == 9) {
            for (int n = 0; n < I_words.length; n++) {

                al.add(I_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemblue, R.id.helloText, al);


        } else if (click == 10) {
            for (int n = 0; n < J_words.length; n++) {

                al.add(J_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemgreen, R.id.helloText, al);


        } else if (click == 11) {
            for (int n = 0; n < K_words.length; n++) {
                al.add(K_words[n]);
            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.item, R.id.helloText, al);
//


        } else if (click == 12) {
            for (int n = 0; n < L_words.length; n++) {
                al.add(L_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemviolet, R.id.helloText, al);

        } else if (click == 13) {
            for (int n = 0; n < M_words.length; n++) {
                al.add(M_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemred, R.id.helloText, al);


        } else if (click == 14) {
            for (int n = 0; n < N_words.length; n++) {
                al.add(N_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemdarkblue, R.id.helloText, al);


        } else if (click == 15) {
            for (int n = 0; n < O_words.length; n++) {
                al.add(O_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemdarkred, R.id.helloText, al);


        } else if (click == 16) {
            for (int n = 0; n < P_words.length; n++) {
                al.add(P_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemdarkgreen, R.id.helloText, al);


        } else if (click == 17) {
            for (int n = 0; n < Q_words.length; n++) {
                al.add(Q_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemblue, R.id.helloText, al);


        } else if (click == 18) {
            for (int n = 0; n < R_words.length; n++) {

                al.add(R_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemgreen, R.id.helloText, al);


        } else if (click == 19) {
            for (int n = 0; n < S_words.length; n++) {

                al.add(S_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.item, R.id.helloText, al);


        } else if (click == 20) {
            for (int n = 0; n < T_words.length; n++) {

                al.add(T_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemviolet, R.id.helloText, al);


        } else if (click == 21) {
            for (int n = 0; n < U_words.length; n++) {

                al.add(U_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemred, R.id.helloText, al);


        } else if (click == 22) {
            for (int n = 0; n < V_words.length; n++) {

                al.add(V_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemdarkblue, R.id.helloText, al);


        } else if (click == 23) {
            for (int n = 0; n < W_words.length; n++) {

                al.add(W_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemdarkred, R.id.helloText, al);


        } else if (click == 24) {
            for (int n = 0; n < X_words.length; n++) {

                al.add(X_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemdarkgreen, R.id.helloText, al);


        } else if (click == 25) {
            for (int n = 0; n < Y_words.length; n++) {

                al.add(Y_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemblue, R.id.helloText, al);


        } else if (click == 26) {
            for (int n = 0; n < Z_words.length; n++) {

                al.add(Z_words[n]);


            }
            arrayAdapter = new ArrayAdapter<>(this, R.layout.itemgreen, R.id.helloText, al);


        }
        //arrayAdapter = new ArrayAdapter<>(this, R.layout.item, R.id.helloText, al);


        flingContainer.setAdapter(arrayAdapter);

        flingContainer.setFlingListener(new SwipeFlingAdapterView.onFlingListener() {
            @Override
            public void removeFirstObjectInAdapter() {
                // this is the simplest way to delete an object from the Adapter (/AdapterView)
                Log.d("LIST", "removed object!");
                al.remove(0);

                arrayAdapter.notifyDataSetChanged();

            }


            @Override
            public void onLeftCardExit(Object dataObject) {
                //Do something on the left!
                //You also have access to the original object.
                //If you want to use it just cast it (String) dataObject

//                i = i + 1;
//                mStrings[i] = (String) dataObject;
//                if (i % 2 != 0)
//
//                    makeToast(MyActivity.this, mStrings[i]);


            }

            @Override
            public void onRightCardExit(Object dataObject) {

//                i = i + 1;
//                mStrings[i] = (String) dataObject;
//                if (i % 2 != 0)
//
//                    makeToast(MyActivity.this, mStrings[i]);
//

            }

            @Override
            public void onAdapterAboutToEmpty(int itemsInAdapter) {
                int click = getIntent().getIntExtra("click", 0);
                if (click == 1) {
                    for (int n = 0; n < A_words.length; n++) {
                        al.add(A_words[n]);
                    }
//        if(click==1){
//        al.add("Abate");
//        al.add("To reduce in amount, degree, or severity");
//        al.add("Abscond");
//        al.add("To leave secretly");
//        al.add("Abstain");
//        al.add("To choose not to do something");
//        al.add("Abyss");
//        al.add("An extremely deep hole");
//        al.add("Adulterate");
//        al.add(" To make impure");
//        al.add("Advocate");
//        al.add("To speak in favor of");
//        al.add("Aesthetic");
//        al.add("Concerning the appreciation of beauty");
//        al.add("Aggrandize");
//        al.add("To increase in power, influence, and reputation");
//        al.add(" Alleviate");
//        al.add("To make more bearable");
//        al.add(" Amalgamate");
//        al.add(" To combine, mix together");
//        al.add(" Ambiguous");
//        al.add("Doubtful or uncertain; able to be interpreted in many ways");
//        al.add("Ameliorate");
//        al.add("To make better; to improve");
//        al.add("Anachronism");
//        al.add("Something out of place in time");


                } else if (click == 2) {
                    for (int n = 0; n < B_words.length; n++) {
                        al.add(B_words[n]);


                    }


                } else if (click == 3) {
                    for (int n = 0; n < C_words.length; n++) {
                        al.add(C_words[n]);


                    }


                } else if (click == 4) {
                    for (int n = 0; n < D_words.length; n++) {
                        al.add(D_words[n]);


                    }


                } else if (click == 5) {
                    for (int n = 0; n < E_words.length; n++) {
                        al.add(E_words[n]);


                    }


                } else if (click == 6) {
                    for (int n = 0; n < F_words.length; n++) {
                        al.add(F_words[n]);


                    }


                } else if (click == 7) {
                    for (int n = 0; n < G_words.length; n++) {
                        al.add(G_words[n]);


                    }


                } else if (click == 8) {
                    for (int n = 0; n < H_words.length; n++) {
                        al.add(H_words[n]);


                    }


                } else if (click == 9) {
                    for (int n = 0; n < I_words.length; n++) {

                        al.add(I_words[n]);


                    }


                } else if (click == 10) {
                    for (int n = 0; n < J_words.length; n++) {

                        al.add(J_words[n]);


                    }


                } else if (click == 11) {
                    for (int n = 0; n < K_words.length; n++) {
                        al.add(K_words[n]);
                    }

//


                } else if (click == 12) {
                    for (int n = 0; n < L_words.length; n++) {
                        al.add(L_words[n]);


                    }


                } else if (click == 13) {
                    for (int n = 0; n < M_words.length; n++) {
                        al.add(M_words[n]);


                    }


                } else if (click == 14) {
                    for (int n = 0; n < N_words.length; n++) {
                        al.add(N_words[n]);


                    }


                } else if (click == 15) {
                    for (int n = 0; n < O_words.length; n++) {
                        al.add(O_words[n]);


                    }


                } else if (click == 16) {
                    for (int n = 0; n < P_words.length; n++) {
                        al.add(P_words[n]);


                    }


                } else if (click == 17) {
                    for (int n = 0; n < Q_words.length; n++) {
                        al.add(Q_words[n]);


                    }


                } else if (click == 18) {
                    for (int n = 0; n < R_words.length; n++) {

                        al.add(R_words[n]);


                    }


                } else if (click == 19) {
                    for (int n = 0; n < S_words.length; n++) {

                        al.add(S_words[n]);


                    }


                } else if (click == 20) {
                    for (int n = 0; n < T_words.length; n++) {

                        al.add(T_words[n]);


                    }


                } else if (click == 21) {
                    for (int n = 0; n < U_words.length; n++) {

                        al.add(U_words[n]);


                    }


                } else if (click == 22) {
                    for (int n = 0; n < V_words.length; n++) {

                        al.add(V_words[n]);


                    }


                } else if (click == 23) {
                    for (int n = 0; n < W_words.length; n++) {

                        al.add(W_words[n]);


                    }


                } else if (click == 24) {
                    for (int n = 0; n < X_words.length; n++) {

                        al.add(X_words[n]);


                    }


                } else if (click == 25) {
                    for (int n = 0; n < Y_words.length; n++) {

                        al.add(Y_words[n]);


                    }


                } else if (click == 26) {
                    for (int n = 0; n < Z_words.length; n++) {

                        al.add(Z_words[n]);


                    }


                }
            }

                @Override
                public void onScroll ( float scrollProgressPercent){
                    View view = flingContainer.getSelectedView();
                    view.findViewById(R.id.item_swipe_right_indicator).setAlpha(scrollProgressPercent < 0 ? -scrollProgressPercent : 0);
                    view.findViewById(R.id.item_swipe_left_indicator).setAlpha(scrollProgressPercent > 0 ? scrollProgressPercent : 0);
                }
            }

            );


            // Optionally add an OnItemClickListener
//        flingContainer.setOnItemClickListener(new SwipeFlingAdapterView.OnItemClickListener(){
//@Override
//public void onItemClicked(int itemPosition,Object dataObject){
//        makeToast(MyActivity.this,"Clicked!");
//        }
//        });
//
        }

    static void makeToast(Context ctx, String s) {

        Toast.makeText(ctx, s, Toast.LENGTH_SHORT).setGravity(Gravity.TOP, 00, 00);

        Toast.makeText(ctx, s, Toast.LENGTH_SHORT).show();

    }


    @OnClick(R.id.right)
    public void right() {
        /**
         * Trigger the right event manually.
         */

        flingContainer.getTopCardListener().selectRight();


    }

//@OnClick(R.id.left)
//public void left(){
//        flingContainer.getTopCardListener().selectLeft();
//
//
//        }
//
//
}
